package securitypractise
import securityPractise.Role
import securityPractise.User
import securityPractise.UserRole

class BootStrap {

    def init = { servletContext ->
        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def userRole = Role.findOrSaveWhere(authority: 'ROLE_USER')
        def admin = User.findOrSaveWhere(username: 'mohit',password: 'pass')
        def user = User.findOrSaveWhere(username: 'mohitbuyer',password: 'passw')
        if(!admin.authorities.contains(adminRole))
        {
            UserRole.create(admin,adminRole,true)
        }
        if (!user.authorities.contains(adminRole))
        {
            UserRole.create(user,userRole,true)
        }
    }
    def destroy = {
    }
}
