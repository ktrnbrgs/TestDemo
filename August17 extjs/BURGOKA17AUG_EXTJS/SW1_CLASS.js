/**
 * Created by BURGOKA on 8/17/2017.
 */
Ext.define('SW1_CLASS', {
	
	Ext.define('DragDropSW.view.MyViewport', {
	    extend: 'Ext.container.Viewport',

	    requires: [
	        'Ext.panel.Panel',
	        'Ext.Img'
	    ],

	    layout: 'column',

	    initComponent: function() {
	        var me = this;

	        Ext.applyIf(me, {
	            items: [
	                {
	                    xtype: 'panel',
	                    height: 402,
	                    itemId: 'mypanel',
	                    width: 420,
	                    layout: 'absolute',
	                    simpleDrag: true,
	                    title: 'My Panel',
	                    items: [
	                        {
	                            xtype: 'image',
	                            x: 250,
	                            y: 30,
	                            draggable: true,
	                            height: 150,
	                            itemId: 'myimg',
	                            width: 134,
	                            src: '%5Capp%5Cimages%5Cgiraffe.jpg'
	                        },
	                        {
	                            xtype: 'image',
	                            x: 70,
	                            y: 260,
	                            draggable: true,
	                            height: 95,
	                            width: 150,
	                            src: '%5Capp%5Cimages%5Crabbit.jpg'
	                        },
	                        {
	                            xtype: 'image',
	                            x: 40,
	                            y: 140,
	                            draggable: true,
	                            height: 110,
	                            width: 160,
	                            src: '%5Capp%5Cimages%5Celephant.jpg'
	                        },
	                        {
	                            xtype: 'image',
	                            x: 520,
	                            y: 140,
	                            draggable: true,
	                            height: 140,
	                            width: 147,
	                            src: '%5Capp%5Cimages%5Ccat.jpg'
	                        },
	                        {
	                            xtype: 'image',
	                            x: 80,
	                            y: 20,
	                            draggable: true,
	                            height: 110,
	                            width: 133,
	                            src: '%5Capp%5Cimages%5Cbear.jpg'
	                        }
	                    ]
	                },
	                {
	                    xtype: 'panel',
	                    height: 402,
	                    width: 454,
	                    simpleDrag: true,
	                    title: 'My Panel'
	                }
	            ]
	        });

	        me.callParent(arguments);
	    }

	});
});