
		//primaryStage.setResizable(false);//设置不可改变窗口大小
		
		primaryStage.heightProperty().addListener(new ChangeListener<Number>() {//监听窗口的高度

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("当前高度 = "+newValue.doubleValue());
			}
			
		});
		
		primaryStage.widthProperty().addListener(new ChangeListener<Number>() {//监听窗口的宽度

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("当前宽度 = "+newValue.doubleValue());
			}
			
		});
		
		
		
		//primaryStage.setFullScreen(true);//设置全屏
		
		//primaryStage.setOpacity(0.5);//设置窗口半透明，值是0到1，0是完全透明；
		
		//primaryStage.setAlwaysOnTop(true);//设置置顶，页面面向用户的最顶部（最前方）；
		
		primaryStage.setX(100);
		primaryStage.setY(100);//设置初始位置
		
		primaryStage.xProperty().addListener(new ChangeListener<Number>() {//监听x轴的值

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("窗口x坐标 = "+newValue);
			}
		});
		
		primaryStage.yProperty().addListener(new ChangeListener<Number>() {//监听y轴的值

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("窗口y坐标 = "+newValue);
			}
		});
		
		
		primaryStage.setScene(new Scene(new Group()));
		primaryStage.show();//显示窗口
		
		//System.out.println("宽度 = "+primaryStage.getWidth());//显示宽度,获得一般用get...; 若要显示默认的宽和高必须在show方法后边
