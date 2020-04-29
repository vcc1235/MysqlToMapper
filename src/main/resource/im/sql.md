### mall
 - file --- **'文件表**
 | 字段名 | 数据类型 | 描述 |
 | ------ | -------- | ------ |
 | file_id | integer |  id, |
 | file_name | char |  名称, |
 | file_url | char |  路径, |
 | file_size | integer |  大小, |
 | file_type | char |  格式, |
 | user_id | char |  拥有者, |
 | create_time | datetime |  创建时间, |
 | update_time | datetime |  更新时间, |
 - friend --- **'好友关系**
 | 字段名 | 数据类型 | 描述 |
 | ------ | -------- | ------ |
 | friend_id | integer |  id, |
 | friend_user_id | char |  用户id, |
 | firend_to_id | char |  好友id, |
 | block | char |  黑名单, |
 | tip | char |  消息置顶, |
 | request | char |  请求添加好友, |
 | response | char |  是否同意添加好友, |
 | create_time | datetime |  创建时间, |
 | update_time | datetime |  更新时间, |
 | monent | char |  指定看朋友圈权限, |
 - member --- **'成员表**
 | 字段名 | 数据类型 | 描述 |
 | ------ | -------- | ------ |
 | member_id | integer |  id, |
 | room_id | integer |  房间id , |
 | user_id | char |  用户, |
 | room_name | char |  群昵称, |
 | room_tip | char |  是否置顶, |
 | room_role | integer |  角色, |
 | create_time | datetime |  创建时间, |
 | update_time | datetime |  更新时间, |
 - room --- **'群组表**
 | 字段名 | 数据类型 | 描述 |
 | ------ | -------- | ------ |
 | room_id | integer |  id, |
 | user_id | char |  创建者, |
 | room_name | char |  名称, |
 | room_type | char |  类型, |
 | room_password | char |  密码, |
 | room_sign | varchar |  签名, |
 | room_sum | bigint |  最多人数, |
 | room_dec | varchar |  介绍, |
 | room_file_list | text |  文件, |
 | room_img_list | text |  相册, |
 | create_time | datetime |  创建, |
 | update_time | datetime |  更新时间, |
 - user --- **'用户表**
 | 字段名 | 数据类型 | 描述 |
 | ------ | -------- | ------ |
 | user_id | char |  用户, |
 | user_account | char |  账号, |
 | user_email | char |  邮箱, |
 | user_nick_name | char |  昵称, |
 | user_password | char |  密码, |
 | user_sex | char |  性别, |
 | user_sign | char |  签名, |
 | user_icon | char |  头像, |
 | user_country | char |  国籍, |
 | user_mobile | char |  手机号, |
 | user_code | char |  区号, |
 | user_provice | char |  省, |
 | user_city | char |  城市, |
 | user_region | char |  县, |
 | create_time | datetime |  创建时间, |
 | update_time | datetime |  更新时间, |
 | status | varchar |  状态, |
