package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_music")
public class TbMusic {

    @TableId(type=IdType.NONE)
    @TableField("music_id")
    private String musicId;
    @TableField("music_name")
    private String musicName;
    @TableField("music_album_name")
    private String musicAlbumName;
    @TableField("music_album_picUrl")
    private String musicAlbumPicurl;
    @TableField("music_mp3Url")
    private String musicMp3url;
    @TableField("music_artist_name")
    private String musicArtistName;
    @TableField("sheet_id")
    private Integer sheetId;


}