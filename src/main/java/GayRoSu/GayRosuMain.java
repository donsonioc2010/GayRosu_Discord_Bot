package GayRoSu;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;


/**
 * 기본적인 것 참고
 * https://www.youtube.com/watch?v=xJqjjPqvu_s&ab_channel=%EA%B0%9C%EB%B0%9C%EC%9E%90%ED%86%A0%EB%AF%B8
 * <p>
 * JDA  : https://github.com/DV8FromTheWorld/JDA/tree/v4.3.0#documentation
 */


/*
메세지를 getContentRaw() 를 할 경우 안들어오는 문제가 있었슴.
Discord의 옵션중 MESSAGE CONTENT INTENT옵션을 활성화 해주면 됨
 */

public class GayRosuMain extends ListenerAdapter {

  public static final String MESSAGE_RECEIVED_PREFIX = "!";
  public static final String DISCORD_TOKEN = "Discord Token Value";
  public static JDA jda;

  public static void main(String[] args) throws LoginException {
    jda = JDABuilder.createDefault(DISCORD_TOKEN)
        .build();

    // 봇의 상태값 온 오프라인 등의 판단
    jda.getPresence().setStatus(OnlineStatus.ONLINE);

    // Bot의 상태메세지
    jda.getPresence().setActivity(Activity.playing("수로랑 플래그좀 "));

    jda.addEventListener(new GayRosuMain());
  }

  /*
  어떻게 나눠볼지 생각이 필요함...
   */
  @Override
  public void onMessageReceived(@NotNull MessageReceivedEvent event) {
    // 공백으로 나눠서 메세지 관리
    Message discordMessageObj = event.getMessage();
    String[] args = discordMessageObj.getContentRaw().split(" ");
    System.out.println(discordMessageObj.getContentRaw());
    if (args == null || event.getAuthor().isBot()) {
      return;
    }
    if (args[0].equals(MESSAGE_RECEIVED_PREFIX + "통장")) {
      event.getChannel().sendMessage("카카오 뱅크 : 3333 02 7291876").queue();
      return;
    }

    if (args[0].equals(MESSAGE_RECEIVED_PREFIX + "핏시")) {
      event.getChannel().sendMessage("엘리시움 체강 동안 미녀 공주 김핏띠 싸마").queue();
      return;
    }

    if (args[0].equals(MESSAGE_RECEIVED_PREFIX + "루먹")) {
      event.getChannel().sendMessage("진짜로 2가 상한 사람").queue();
      return;
    }

    if (args[0].equals(MESSAGE_RECEIVED_PREFIX + "야근")) {
      event.getChannel().sendMessage("오늘은 달수야 큐님이야 핏시님이야? 아 행규는 이제 백수해적단이지?").queue();
      return;
    }

    if (args[0].equals(MESSAGE_RECEIVED_PREFIX + "아돌")) {
      event.getChannel().sendMessage("쓰레기").queue();
      return;
    }

    if (args[0].equals(MESSAGE_RECEIVED_PREFIX + "비틱")) {
      event.getChannel().sendMessage("또 쭝으니야?").queue();
      return;
    }


  }
}
