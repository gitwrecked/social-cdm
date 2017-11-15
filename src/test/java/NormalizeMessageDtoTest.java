import com.gitwrecked.social.v0.dto.NormalizedMessageDto;
import com.gitwrecked.social.v0.dto.TwitterMessageDto;
import org.junit.Assert;
import org.junit.Test;

public class NormalizeMessageDtoTest {
	@Test
	public void testNormalizeMessageDto() {
		NormalizedMessageDto normalizedMessageDto = new NormalizedMessageDto();
		normalizedMessageDto.setMessage("Hello");
		Assert.assertEquals("Hello", normalizedMessageDto.getMessage());
		Assert.assertEquals(true, normalizedMessageDto.getIsNormalized());
		Assert.assertEquals(null, normalizedMessageDto.getSource());
	}
}
