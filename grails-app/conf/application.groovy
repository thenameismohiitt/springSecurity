

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.password.algorithm = 'SHA-256'
grails.plugin.springsecurity.password.hash.iterations = 1
grails.plugin.springsecurity.userLookup.userDomainClassName = 'securityPractise.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'securityPractise.UserRole'
grails.plugin.springsecurity.authority.className = 'securityPractise.Role'
grails.plugin.springsecurity.logout.postOnly = false
//grails.plugin.databasemigration.updateOnStart = true
//grails.plugin.databasemigration.updateOnStartFileName = 'changelog.groovy'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/auth.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/console/**',     access: ['permitAll']],
	[pattern:  '/static/console/**', access:['permitAll']],
	[pattern:  '/plugins/console*/**', access:['permitAll']] // Grails 2.x

]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

