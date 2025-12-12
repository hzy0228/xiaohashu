package cn.hdy.xiaohashu.user.relation.biz.constant;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/12/1 11:09
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface MQConstants {

    /**
     * Topic: 关注、取关共用一个
     */
    String TOPIC_FOLLOW_OR_UNFOLLOW = "FollowUnfollowTopic";

    /**
     * 关注标签
     */
    String TAG_FOLLOW = "Follow";

    /**
     * 取关标签
     */
    String TAG_UNFOLLOW = "Unfollow";

}
