package cn.wildfire.chat.app;

import cn.wildfire.chat.kit.third.utils.FileUtils;

/**
 * Created by heavyrain lee on 2017/11/24.
 */

public interface Config {

    String IM_SERVER_HOST = "wildfirechat.cn";
    int IM_SERVER_PORT = 80;

    String APP_SERVER_HOST = "wildfirechat.cn";
    int APP_SERVER_PORT = 8888;

    String ICE_ADDRESS = "turn:turn.liyufan.win:3478";
    String ICE_USERNAME = "wfchat";
    String ICE_PASSWORD = "wfchat";

    String QR_CODE_PREFIX_PC_SESSION = "wildfirechat://pcsession/";
    String QR_CODE_PREFIX_USER = "wildfirechat://user/";
    String QR_CODE_PREFIX_GROUP = "wildfirechat://group/";

    int DEFAULT_MAX_AUDIO_RECORD_TIME_SECOND = 120;
    String VIDEO_SAVE_DIR = FileUtils.getDir("video");
    String PHOTO_SAVE_DIR = FileUtils.getDir("photo");
    String HEADER_SAVE_DIR = FileUtils.getDir("header");
}
