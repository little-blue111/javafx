    Stage s2 = new Stage();
		s2.setTitle("s2");
		//s2.initModality(Modality.APPLICATION_MODAL);//有application模态窗口时，不能调用其他窗口，除非关了
		//s2和s1关联
		
		//s2.initStyle(StageStyle.TRANSPARENT);//透明的背景，且没有装饰，不经常用
		
		
		Stage s3 = new Stage();
		s3.setTitle("s3");
		//s3.initModality(Modality.NONE);
		s3.initOwner(s1);//s1和s3关联，能有s2的效果
		s3.initModality(Modality.WINDOW_MODAL);
    
    
    //platform有关内容
    //Platform.setImplicitExit(false);//如果为false时,即使把窗口关了，程序仍不会退出，只有调用Platform.exit();才能全部关闭
		//primaryStage.show();
		//Platform.isSupported(ConditionalFeature.SCENE3D);//检验isSupported是否支持3d打印，返回布尔值；
    
    System.out.println("当前屏幕的dpi是： "+screen.getDpi());//dpi：像素每英寸
		
		Rectangle2D rec1 = screen.getBounds();//获得屏幕的宽和高；
		Rectangle2D rec2 = screen.getVisualBounds();//可视范围内的屏幕的宽度和高度；
		
		System.out.println("全屏幕的坐标：");
		System.out.println("左上角x = "+ rec1.getMinX()+"  左上角y = "+rec1.getMinY());
		System.out.println("右下角x = "+ rec1.getMaxX()+"  右下角y = "+rec1.getMaxY());
		
		System.out.println("可视的坐标：");
		System.out.println("左上角x = "+ rec2.getMinX()+"  左上角y = "+rec2.getMinY());
		System.out.println("右下角x = "+ rec2.getMaxX()+"  右下角y = "+rec2.getMaxY());
    
    //超链接
    HostServices host = getHostServices();
		host.showDocument("www.baidu.com");

		URL url = getClass().getClassLoader().getResource("Stage/twi.png");//得到一个图片的url
		String path = url.toString();//把图片的url改为String
		
		Button button = new Button("按钮");
		button.setCursor(Cursor.MOVE);//在按钮区域光标变成移动
		
		Group group = new Group();
		group.getChildren().add(button);
		
		Scene scene = new Scene(group);//button和scene关联
		//scene.setCursor(Cursor.CLOSED_HAND);//在视图区域光标变成手
		scene.setCursor(Cursor.cursor(path));//在视图区域光标变成加载的小图片
    
    //group.getChildren().remove(1);//移除元素
		//group.getChildren().clear();//全部清除
    
    //b1.setFont(Font.font("sans-serif", 40));//改变button上的字体
		//b1.setTextFill(Paint.valueOf("#ffffff"));//改变button字体的颜色
		
		/*
		//button类型，上右下左;00表示透明，55表示半透明
		BackgroundFill bgf = new BackgroundFill(Paint.valueOf("#62626255"), new CornerRadii(20), new Insets(0,10,20,30));
		Background value = new Background(bgf);
		b1.setBackground(value);
		
		BorderStroke bos = new BorderStroke(Paint.valueOf("#727272"), BorderStrokeStyle.DOTTED,new CornerRadii(20), new BorderWidths(5));//button边框类型
		Border bo = new Border(bos);
		b1.setBorder(bo);
		*/
		
		b1.setStyle(
				"-fx-background-color:#7ccd7c;"+//设置背景颜色
				"-fx-background-radius:20;"+//设置边角的弧度
				"-fx-text-fill:#ffffff"//设置字体颜色
				);
		
		//单击事件
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				Button bu = (Button)event.getSource();//event.getSource();可以返回一个button
				System.out.println(bu.getText());//每点击一下按钮b1则打印一下；
			}
		});
    
    
    //检测键盘
//		b1.setOnKeyPressed(new EventHandler<KeyEvent>(){
//
//			@Override
//			public void handle(KeyEvent event) {
//				// TODO Auto-generated method stub
//				System.out.println(event.getCode().getName());
//			}
//			
//		});
//		
//		b1.setOnKeyReleased(new EventHandler<KeyEvent>(){
//
//			@Override
//			public void handle(KeyEvent event) {
//				// TODO Auto-generated method stub
//				
//				if(event.getCode().getName().equals(KeyCode.A.getName())) {
//					System.out.println("释放 = "+event.getCode().getName());
//				}
//			}
//			
//		});
		
		
		
		//双击事件
//		b1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				//System.out.println("鼠标单击");
//				
//				System.out.println(event.getButton().name());
//				
//				if(event.getClickCount() == 2 && event.getButton().name().equals(MouseButton.PRIMARY.name())) {//设定点击鼠标的次数，此时是双击
//					System.out.println("双击事件");
//				}
//			}
//			
//		});
		
