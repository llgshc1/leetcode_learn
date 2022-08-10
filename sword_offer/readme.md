#剑指offer刷题
 #DAY 6.24
  ![img.png](readme/img.png)
  前序遍历：根左右
  中序遍历：左根右
  解法：递归 自己调用自己 只需找到跟节点 以及左右子树每一次的前序遍历以及中序遍历
  09
  解法 使用两个辅助栈 append就直接加上去 delete方法将主栈的内容弹到辅助站 辅助站在弹出
  13
  解法DFS深度搜索 青蛙能跳到的地方即为能到达 调到的地方的四周即为能访问 一个boolean数组记录跳的位置是否已访问
  已访问且已满足条件 计数加一
  14
  动态规划
  ![img.png](img.png)
  状态表示：dp[ i ]存储绳子长度为i时的最大乘积。那么dp[n]即绳子长度为n时的最大乘积。

集合划分： 依题意，绳子至少被剪一次，所以绳子长度最小为2。由于已知至少剪一刀，我们索性假设第一刀剪在长度为j的位置(即第一段绳子长度为j)。剩下的那段长度为( i - j )的绳子就变成了“可剪可不剪”。那究竟是“不剪了”得到的乘积大呢，还是“继续剪余下的这段”得到乘积更大？我们不知道，所以需要两种情况都计算一下进行比较。其中，“不剪了”得到的乘积是j * ( i - j )，“继续剪”得到的乘积是j * dp[ i - j ]。取其中的较大值，就是“第一剪在j位置”能得到的最大乘积。而第一剪的所有可能位置是1,2,…,i-1。依次计算所有可能情况，取最大值即为dp[ i ]的值。

 15俄罗斯方块 一个一个1 消去
 ![img_1.png](img_1.png)
 16 整数幂
 ![img_2.png](img_2.png)
 ![img_3.png](img_3.png)
 18  给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
*
* 返回删除后的链表的头节点。
![img_4.png](img_4.png)
  19 正则表达式
  b站视频
  https://www.bilibili.com/video/BV1ZE411P7mS?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  20 有效数字
  b站视频
  https://www.bilibili.com/video/BV1G7411U7ti?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  21
  ![img_5.png](img_5.png)
  22
   定义两个指针 一个先走k步 然后两个一起走 第一个走到最后是 第二个刚好少走了k步
  24链表翻转
  ![img_6.png](img_6.png)
  26 判断是不是一个树的另一个部分
  ![img_7.png](img_7.png)
  28 镜像二叉树
  ![img_8.png](img_8.png)
  29
  b站视频
  https://www.bilibili.com/video/BV1zT4y1J7Zy?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  30 minStack
  b站视频
  https://www.bilibili.com/video/BV1aK4y1C7Qd?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  31 进出栈
  ![img_9.png](img_9.png)
  32 二叉树遍历
  ![img_10.png](img_10.png)
  322 二叉树左右遍历
  323 二叉树之字遍历
  B站视频
  https://www.bilibili.com/video/BV1T64y1h7hB?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  33 判断是否为后续遍历
  ![img_11.png](img_11.png)
  34 某条路径之和
  B站视频
  https://www.bilibili.com/video/BV1nK4y1u783?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  
  35复制复杂链表
  
  B站视频
  
  https://www.bilibili.com/video/BV1XE411L7CK?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  38 字符串排列组合
  B站视频
  https://www.bilibili.com/video/BV1wq4y1p7fJ?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  39 数字出现超过数组一半
  ![img_12.png](img_12.png)
  41
  B站视频
  https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/comments/
  42
  B站视频
  https://www.bilibili.com/video/BV1ML4y1h7S8?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c
  44
  ![img_13.png](img_13.png)
  45
  B站视频
  https://www.bilibili.com/video/BV1Nz41187Ai?spm_id_from=333.337.search-card.all.click&vd_source=d29cb08e3ad363cbedf86a25badae61c