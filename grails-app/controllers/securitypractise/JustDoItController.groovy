package securitypractise
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN','ROLE_USER'])
class JustDoItController {
    def springSecurityService
    def index()
    {
        //def  user = springSecurityService.currentUser
        def  role = springSecurityService.getPrincipal().getAuthorities()
        String roles = role.toString()
        if (roles.equals('[ROLE_ADMIN]'))
        {
            render (view:'admin')
        }
        else
        {
            render (view: 'fun')
        }
    }
}
