package com.tts.hosteddatabase.configuration;

//import com.tts.hosteddatabase.service.VolunteerService;


//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private VolunteerService volunteerService;
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(volunteerService)
//                .passwordEncoder(bCryptPasswordEncoder);
//
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/cart").authenticated()
//                .antMatchers("/charge").authenticated()
//                .and().formLogin()
//                .loginPage("/signin").permitAll()
//                .loginProcessingUrl("/login").permitAll()
//                .and().logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/signout"))
//                .logoutSuccessUrl("/");
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web
//                .ignoring()
//                .antMatchers("/console/**");
//    }
//
//}