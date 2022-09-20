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
        
        stage('spotless') {
            steps {
                sh './gradlew build'
            }
        }
        
        stage('build') {
            steps {
                sh './gradlew build'
            }
        }
        
        stage('sonar') {
            steps {
                // this guy fully qulifies plugin so we don't have to put in project https://www.youtube.com/watch?v=KsTMy0920go
                withSonarQubeEnv(installationName: 'sq1') {
                    sh './gradlew sonar'
                }
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
            steps {
                sh 'docker system prune -f'
            }
        }        
        
    }
}