plugins {
    id("java")
    id("org.springframework.boot") version "3.5.12"
}

group = "demo.elastic.rag"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.springframework.ai:spring-ai-bom:1.1.3"))

    implementation("org.springframework.ai:spring-ai-starter-vector-store-elasticsearch")
    implementation("org.springframework.ai:spring-ai-starter-model-google-genai")
    implementation("org.springframework.ai:spring-ai-starter-model-google-genai-embedding")
    implementation("org.springframework.ai:spring-ai-pdf-document-reader")

    implementation("org.springframework.boot:spring-boot-starter-web:3.5.12")
}
