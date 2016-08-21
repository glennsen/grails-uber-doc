class UberdocGrailsPlugin {
    def version = "1.0.8"
    def grailsVersion = "2.4 > *"
    def pluginExcludes = [
            "grails-app/controllers/**",
            "grails-app/domain/**",
            "src/groovy/sample/**"
    ]

    def title = "UberDoc - Rest-API Documentation"
    def author = "Florian Huebner"
    def authorEmail = "florian@uberall.com"
    def description = '''\
uberDoc is a very simple solution for creating API documentation based on annotations in domain objects and controllers, and Grails' message system.

It goes through controllers, finds resources, fetches all used objects, and extracts all parameters, headers, errors, etc.

For more documentation, see our GitHub repository.
'''

    def documentation = "https://github.com/uberall/grails-uber-doc"
    def license = "BSD"
    def organization = [name: "uberall", url: "https://uberall.com/"]
    def developers = [
        [name: "Florian Langenhahn", email: "florian.langenhahn@uberall.com"],
        [name: "Florian Huebner", email: "florian@uberall.com"],
        [name: "Philipp Eschenbach", email: "philipp@uberall.com"],
        [name: "Alex Pedini", email: "alex.pedini@gmail.com"]]
    def issueManagement = [system: "GitHub", url: "https://github.com/uberall/grails-uber-doc/issues"]
    def scm = [url: "https://github.com/uberall/grails-uber-doc/"]
}
