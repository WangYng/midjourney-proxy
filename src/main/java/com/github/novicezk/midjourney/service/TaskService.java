package com.github.novicezk.midjourney.service;

import java.util.List;

import com.github.novicezk.midjourney.enums.BlendDimensions;
import com.github.novicezk.midjourney.result.SubmitResultVO;
import com.github.novicezk.midjourney.support.Task;

import eu.maxschuster.dataurl.DataUrl;

public interface TaskService {

	SubmitResultVO submitImage(Task task, DataUrl dataUrl);

	SubmitResultVO submitImagine(Task task, List<DataUrl> dataUrls);

	SubmitResultVO submitUpscale(Task task, String targetMessageId, String targetMessageHash, int index,
			int messageFlags);

	SubmitResultVO submitVariation(Task task, String targetMessageId, String targetMessageHash, int index,
			int messageFlags);

	SubmitResultVO submitReroll(Task task, String targetMessageId, String targetMessageHash, int messageFlags);

	SubmitResultVO submitDescribe(Task task, DataUrl dataUrl);

	SubmitResultVO submitBlend(Task task, List<DataUrl> dataUrls, BlendDimensions dimensions);
}