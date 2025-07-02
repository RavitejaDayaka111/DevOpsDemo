pipeline {
    agent any

    stage('Checkout') {
    steps {
        git 'https://github.com/RavitejaDayaka111/DevOpsDemo.git'
    }
}

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
