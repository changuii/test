pipeline {
    agent any
    stages {
        stage('gradle build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('docker rmi'){
                    steps{
                        sh 'sudo docker stop test'
                        sh 'sudo docker rm test'
                        sh 'sudo docker rmi test/changuii:latest'
                    }
        }
        stage('docker build'){
            steps{
                sh 'sudo docker build -t test/changuii:latest .'
                sh 'sudo docker images'
            }
        }
        stage('docker run'){
            steps{
                sh 'sudo docker run -d -p 10000:8080 --name test test/changuii:latest'
            }
        }
    }
}