# -*- coding: utf-8 -*-
{
    'name': "Parquimetro",

    'summary': """
    Paquimetro""",

    'description': """
        Practica de Odoo v11.00
    """,

    'author': "Bruno Ivan Silva Narro",
    'website': "www.algun-lugar.com",

    # Categories can be used to filter modules in modules listing
    # Check https://github.com/odoo/odoo/blob/master/odoo/addons/base/module/module_data.xml
    # for the full list
    'category': 'Others',
    'version': '0.1',

    # any module necessary for this one to work correctly
    'depends': ['base'],

    # always loaded
    'data': [
        # 'security/ir.model.access.csv',
        'views/views.xml',
        'views/templates.xml',
    ],
    # only loaded in demonstration mode
    'demo': [
        'demo/demo.xml',
    ],
}