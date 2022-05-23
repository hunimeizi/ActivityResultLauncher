# wechatImagePicker 仿微信选择图片

#### 使用方法
1.使用gradle
```js
repositories {
  google()
  mavenCentral()
}

dependencies {
  //以下务必全部依赖
  implementation 'io.github.hunimeizi:haolinActivityResultLauncher:1.0.0'
}
```

2
```js
  btnJump.setOnClickListener {
            //跳转到第二页 传参
            launcher.launch<SecondActivity>(
                "name" to "张三",
                "ege" to "12"
            ) { resultCode, data ->
                if(resultCode == RESULT_OK) {
                    data?.getStringExtra("name")?.let {
                        Log.e("lyb======", it)
                    }
                }
            }
        }
        
        
  Log.e("lyb======", intent.getStringExtra("name") ?: "name空")
  Log.e("lyb======", intent.getStringExtra("ege") ?: "ege空")
  val btnJump = findViewById<Button>(R.id.btnJump)
  btnJump.setOnClickListener {
            val intent = Intent().apply {
                putExtra("name", "张三")
            }
            setResult(RESULT_OK, intent)
            finish()
        }
```

#### 内嵌上传 Maven Central
详细请看教程
[JCenter已经提桶跑路，是时候学会上传到Maven Central了](https://mp.weixin.qq.com/s/CrfYc1KsugJKPy_0rDZ49Q)