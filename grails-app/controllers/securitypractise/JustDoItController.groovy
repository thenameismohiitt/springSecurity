package securitypractise
import grails.plugin.springsecurity.annotation.Secured
import securityPractise.Role

@Secured(['ROLE_ADMIN','ROLE_USER'])
class JustDoItController {
    def index()
    {
        def role = new Role()
        def rolef = role.authority
        if (rolef.equals('ROLE_ADMIN'))
        {
            render(view: 'admin')
        }
        else
        {
            render(view: 'fun')
        }
    }
}
