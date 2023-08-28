package com.github.novicezk.midjourney.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel("Image提交参数")
@EqualsAndHashCode(callSuper = true)
public class SubmitImageDTO extends BaseSubmitDTO {

	@ApiModelProperty(value = "图片base64")
	private String base64;
}
