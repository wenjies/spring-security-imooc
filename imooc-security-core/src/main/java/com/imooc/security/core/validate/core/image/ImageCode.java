package com.imooc.security.core.validate.core.image;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

import com.imooc.security.core.validate.core.ValidateCode;

public class ImageCode extends ValidateCode {
	
	private BufferedImage image;
	
	public ImageCode(BufferedImage image, String code, int expireIn) {
		super(code, expireIn);
		this.image = image;
	}
	
	public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
		super(code, expireTime);
		this.image = image;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ImageCode [" + "code=" + code + ", expireTime=" + expireTime + "]";
	}
}
