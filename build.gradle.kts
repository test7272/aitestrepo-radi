plugins { kotlin("jvm") version "1.9.10" }
repositories { mavenCentral() }
dependencies {
    implementation("androidx.compose.ui:ui:1.5.4")
    implementation("io.ktor:ktor-server-core-jvm:2.3.4")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.jsoup:jsoup:1.15.4")
    implementation("org.slf4j:slf4j-api:2.0.7")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.2")
    implementation("org.apache.httpcomponents:httpclient:4.5.14")
    implementation("com.google.android.material:material:1.11.0")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("org.eclipse.jetty:jetty-server:11.0.15")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("ch.qos.logback:logback-classic:1.4.6")
    implementation("androidx.compose.material:material:1.5.4")
    implementation("org.mongodb:mongodb-driver-sync:4.9.0")
    implementation("com.squareup.sqldelight:android-driver:1.5.5")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.junit.jupiter:junit-jupiter:5.9.2")
    implementation("org.mockito:mockito-core:5.2.0")
}
