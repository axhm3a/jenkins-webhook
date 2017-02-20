pipeline {
    agent any

    stages {
        stage('test') {
            steps {
                echo 'Testing..'
                sh "./gradlew test"
            }
        }
        stage('build') {
            steps {
                echo 'Building..'
                sh "./gradlew build"
            }
        }
    }
}