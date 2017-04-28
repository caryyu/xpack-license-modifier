# 说明
我主要在5.0.1版本下面进行操作的,如遇其他版本问题请留言告知.

# 注意
1. 在执行以下命令时候请进入到"x-pack-xxx.jar"目录下进行操作;
2. 在执行命令前确保Java环境是否正常.

# 命令步骤
## 下载XLM
```
wget https://github.com/caryyu/xpack-license-modifier/releases/download/1.0/xlm-1.0.jar
```
## 执行XLM
```
java -jar xlm-1.0.jar x-pack-5.0.1.jar
```
## 更新核心JAR文件
```
jar uvf x-pack-5.0.1.jar org/elasticsearch/license/License\$Builder.class
```