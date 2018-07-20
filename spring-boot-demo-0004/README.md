## demo01: 基础示例

## demo02: 获取参数

▶ gradle build
▶ java -jar ./build/libs/demo02-0.0.1-SNAPSHOT.jar  --msg=hi test.txt

This is CustomApplicationRunner01
获取所有命令行参数
--msg=hi
test.txt
------
获取所有选项
msg
------
获取解析后的参数，以 --msg 为例子
--msg选项的值有：
hi
------
获取无选项指定的参数
test.txt

▶ java -jar ./build/libs/demo02-0.0.1-SNAPSHOT.jar  --msg=hi --msg=hi2 test.txt
This is CustomApplicationRunner01
获取所有命令行参数
--msg=hi
--msg=hi2
test.txt
------
获取所有选项
msg
------
获取解析后的参数，以 --msg 为例子
--msg选项的值有：
hi
hi2
------
获取无选项指定的参数
test.txt


## demo03: 多个runner

## demo04: 多个runner 顺序问题

## demo05: 基于接口的顺序指定

## demo06: 和SpringApp放在一起

demo07: 和commandline 的顺序问题。