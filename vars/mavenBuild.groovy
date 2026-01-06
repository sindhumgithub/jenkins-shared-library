def call() {
    echo "I am MAVEN build tool from JAVA"
    sh 'mvn clean install'
}
