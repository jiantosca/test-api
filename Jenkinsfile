//https://github.com/jstrachan/spring-boot-web-gradle/blob/master/Jenkinsfile - for more in depth sample.

pipeline {
    
    agent {
        label 'any'
    }
    
    stages {
        stage('clean') {
            steps {
                sh './gradlew clean --no-daemon'
            }
        }

    stage('clean') {
            steps {
                sh './gradlew build --no-daemon'
            }
        }
    }
    
}

