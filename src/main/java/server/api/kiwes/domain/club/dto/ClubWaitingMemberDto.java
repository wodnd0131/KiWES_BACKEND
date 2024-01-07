package server.api.kiwes.domain.club.dto;

import lombok.*;
import server.api.kiwes.domain.member.entity.Member;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClubWaitingMemberDto {
    Long memberId;
    String nickname;
    String profileImg;

    public static ClubWaitingMemberDto of(Member member){
        return ClubWaitingMemberDto.builder()
                .memberId(member.getId())
                .profileImg(member.getProfileImg())
                .nickname(member.getNickname())
                .build();
    }
}
