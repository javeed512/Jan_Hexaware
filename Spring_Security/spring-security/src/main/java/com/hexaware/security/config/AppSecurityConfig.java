package com.hexaware.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider() {
		
		DaoAuthenticationProvider provider=		new DaoAuthenticationProvider();
		
			provider.setUserDetailsService(userDetailsService);
			//provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
			
			provider.setPasswordEncoder(new BCryptPasswordEncoder());
			
		
			return provider;
	}

	/*
	 * @Override
	 * 
	 * @Bean protected UserDetailsService userDetailsService() {
	 * 
	 * List<UserDetails> users = new ArrayList<UserDetails>();
	 * 
	 * users.add(User.withDefaultPasswordEncoder().username("javeed").password(
	 * "tiger").roles("USER").build());
	 * users.add(User.withDefaultPasswordEncoder().username("king").password("lion")
	 * .roles("ADMIN").build());
	 * 
	 * 
	 * return new InMemoryUserDetailsManager(users);
	 * 
	 * }
	 */

}
