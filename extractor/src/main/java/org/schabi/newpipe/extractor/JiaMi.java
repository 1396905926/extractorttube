package org.schabi.newpipe.extractor;

import com.spoon.pass.encrypt.Encrypt;
import com.spoon.pass.encrypt.EncryptField;


@Encrypt(randomPsw = true)
public class JiaMi {

    @EncryptField(src = "AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
    public static String HARDCODED_KEY;


    @EncryptField(src = "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w")
    public static String ANDROID_YOUTUBE_KEY;


    @EncryptField(src = "AIzaSyB-63vPrdThhKuerbB2N_l7Kwwcxj6yUAc")
    public static String IOS_YOUTUBE_KEY;


    @EncryptField(src = "AIzaSyC9XL3ZjWddXya6X74dJoCTL-WEYFDNX30")
    public static String HARDCODED_YOUTUBE_MUSIC_KEY;

}
