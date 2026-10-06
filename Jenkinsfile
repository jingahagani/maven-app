pipeline {
    agent any
 
    stages {
        stage('Build and Test') {
            steps {
                sh '''
                    export JAVA_HOME=/usr/lib/jvm/java-21-amazon-corretto.x86_64
                    export PATH=$JAVA_HOME/bin:$PATH
                    java -version
                    mvn clean package
                '''
            }
        }
    }
}
