//https://github.com/jstrachan/spring-boot-web-gradle/blob/master/Jenkinsfile - for more in depth sample.

pipeline {
    
    agent any
    
    stages {
        stage('clean') {
            steps {
                sh './gradlew clean'
            }
        }

        stage('build') {
            steps {
                sh './gradlew build'
            }
        }
    }
    
}

