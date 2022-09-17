//https://github.com/jstrachan/spring-boot-web-gradle/blob/master/Jenkinsfile - for more in depth sample.

pipeline {
    
    agent any
    
    options {
        timestamps()
    }

    stages {
        
        stage('clean') {
            steps {
                sh './gradlew clean'
                sh './gradlew dockerClean'
            }
        }

        stage('build') {
            steps {
                sh './gradlew build'
            }
        }
        
        stage('docker') {
             when {
                anyOf { 
                    branch 'release-*'; branch 'master' 
                }
            }
            steps {
                sh './gradlew docker'
            }
        }
        
        stage('cleanup') {
            when {
                anyOf { 
                    branch 'release-*'; branch 'master' 
                }
            }
            steps {
                sh 'docker system prune -f'
            }
        }        
        
    }
}