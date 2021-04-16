plugins {
    `maven-publish`
    `com.android.library`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["release"])
            groupId = "top.chuxubank.frp"
            artifactId = "frpclib"
            version = "0.36.2"
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/chuxubank/frplib")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
