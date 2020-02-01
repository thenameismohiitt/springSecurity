package securitypractise

import grails.plugin.springsecurity.annotation.Secured

class JustDoItController {
    @Secured(['ROLE_ADMIN'])
    def index() { }
    @Secured(['ROLE_USER'])
    def fun()
    {}
}
