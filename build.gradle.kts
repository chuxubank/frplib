plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "frpclib"
            groupId = "top.chuxubank.frp"
            version = "1.1"
            artifact("frpclib.aar")
            artifact("frpclib-sources.jar")
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
