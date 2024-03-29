package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SlashText {

  private String token;
  private String command;
  private String text;

  @JsonProperty("enterprise_id")
  private String enterprise_id;

  @JsonProperty("enterprise_name")
  private String enterprise_name;

  @JsonProperty("trigger_id")
  private String trigger_id;

  @JsonProperty("team_id")
  private String teamId;

  @JsonProperty("team_domain")
  private String teamDomain;

  @JsonProperty("channel_id")
  private String channelId;

  @JsonProperty("channel_name")
  private String channelName;

  @JsonProperty("user_id")
  private String userId;

  @JsonProperty("user_name")
  private String userName;

  @JsonProperty("response_url")
  private String responseUrl;
}
