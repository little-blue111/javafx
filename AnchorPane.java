AnchorPane ap = new AnchorPane();//和group用法一样,是一个点位布局类；ap只能管理子类的位置，不能管理孙类的位置
			
		ap.setStyle("-fx-background-color:#ff3e96");//设置背景颜色
		
//		ap.setOnMouseClicked(new EventHandler<MouseEvent>() {//鼠标监听事件
//
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				System.out.println("gasdgafg");
//			}
//			
//		});
		
//		ap.setPadding(new Insets(10));//设置ap的内边距
				
//		设置b2的位置,相对父空间的位置,距离四周都是10个像素;
//		ap.setTopAnchor(b2, 10.0);
//		ap.setLeftAnchor(b2, 10.0);
//		ap.setRightAnchor(b2, 10.0);
//		ap.setBottomAnchor(b2, 10.0);
				
//		设置b1的位置
//		ap.setTopAnchor(b1, 100.0);
//		ap.setLeftAnchor(b1, 10.0);		
		
		
		Group g1 = new Group();
		Group g2 = new Group();
		
		g1.getChildren().addAll(b1,b2);
		g2.getChildren().addAll(b3,b4);
		
		ap.setTopAnchor(g1, 10.0);
		ap.setLeftAnchor(g1, 100.0);
		
		AnchorPane ap2 = new AnchorPane();
		ap2.setStyle("-fx-background-color:#98cd98");//作为子类时只有管理好位置后才会出现背景颜色，和html中确定width和height很像
		
			
		ap.getChildren().add(ap2);
		
//		ap.getChildren().addAll(g1, g2);//添加两个按钮
		
			
		Scene scene = new Scene(ap);
		primaryStage.setScene(scene);
		primaryStage.setTitle("javafx");
		primaryStage.setWidth(600);
		primaryStage.setHeight(600);
		primaryStage.show();
		
		//管理位置必须四周(距离位置可以确定一个方框),必须等show之后ap才有高度
		ap.setTopAnchor(ap2, 10.0);
		ap.setLeftAnchor(ap2, 10.0);
		ap.setRightAnchor(ap2, ap.getWidth()/2);
		ap.setBottomAnchor(ap2, ap.getHeight()/2);
		
		primaryStage.heightProperty().addListener(new ChangeListener<Number>() {//监听宽和高，缩放窗口也可以把子类的

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				ap.setBottomAnchor(ap2, ap.getHeight()/2);
			}
			
		});
		
		primaryStage.widthProperty().addListener(new ChangeListener<Number>() {//监听宽和高，缩放窗口也可以把子类的

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				ap.setRightAnchor(ap2, ap.getWidth()/2);
			}
			
		});
