pipeline {
    agent any

    tools {
        jdk 'Java21'
        maven 'Maven'
    }

    stages {
        stage('Build and Test') {
            steps {
                sh 'java -version'
                sh 'mvn clean package'
            }
        }
    }
}
