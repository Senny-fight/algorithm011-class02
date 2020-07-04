学习笔记

哈希表: 哈希函数

哈希碰撞：拉链式解决冲突法

增加、删除O(1)，退化成链表O(n)

Map、Set(key能否重复)
HashMap小结：
java1.8之后基于链表和红黑树实现，泊松分布决定扩散因子为1.5倍

树: 单链表next指向多个node

root、Parent Node、Child Node

树和图(能否成环)

左中右遍历(根节点位置)

二叉搜索树BST：
	左子树节点小于根节点，右子树节点大于根节点
	时间复杂度O(logn)

堆：可以迅速找到最大值和最小值的数据结构

大顶堆、小顶堆

时间复杂度：
	find-max：O(1)
	delete-max: O(logn)
	insert(create):O(logn)or(log1)

二叉堆:完全二叉树
	一棵完全树、树中任意节点>=子节点

图:点和边Graph(V,E)

无向无权图：邻接表和邻接矩阵

DFS、BFS