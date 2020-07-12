学习笔记

递归

自己调用自己，调用栈

1.递归终止条件
2.业务逻辑代码
3.下探到下一层
4.清理当前层

public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}

思维要点：
1.不要人肉进行递归
2.找到最近最简方法， 拆解成可重复解决的问题（重复子问题）
3.数学归纳法思维


分治回溯：特殊的递归

子结果合并在一起

回溯：尝试分步解决一个问题，不断地在每一层去试