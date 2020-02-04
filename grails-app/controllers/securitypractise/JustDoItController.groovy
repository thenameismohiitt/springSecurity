package securitypractise
import grails.plugin.springsecurity.annotation.Secured
import securityPractise.Role
import securityPractise.User

@Secured(['ROLE_ADMIN','ROLE_USER'])
class JustDoItController {
    def springSecurityService
    def index()
    {
        User user = springSecurityService.currentUser
        Set<Role> roles = user.getAuthorities()
        boolean flag = roles*.authority.contains('ROLE_ADMIN')
        //Set<Role> role = user.getAuthorities()
        if(flag)
        {
            render (view:'admin')
        }
        else
        {
            render (view: 'fun')
        }
    }http://localhost:8080/
}
