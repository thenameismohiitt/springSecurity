import org.springframework.web.servlet.i18n.FixedLocaleResolver
import org.springframework.web.servlet.i18n.SessionLocaleResolver
import securityPractise.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    localeResolver(SessionLocaleResolver) {
        defaultLocale= new Locale('fr')
    }
}
