package gun.study.springstudy;

import gun.study.springstudy.repository.MemberRepository;
import gun.study.springstudy.repository.MemoryMemberRepository;
import gun.study.springstudy.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository(); // MemberRepository 가 아닌 구현체인 MemoryMemberRepository 를 리턴해줌.
    }




}
