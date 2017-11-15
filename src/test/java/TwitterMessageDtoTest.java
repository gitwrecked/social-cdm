import com.gitwrecked.social.v0.dto.TwitterMessageDto;
import org.junit.Assert;
import org.junit.Test;

public class TwitterMessageDtoTest {
	@Test
	public void testTwitterMessageDto() {
		TwitterMessageDto twitterMessageDto = new TwitterMessageDto();
		twitterMessageDto.setMessage("Hello");
		Assert.assertEquals("Hello", twitterMessageDto.getMessage());
	}
}
