# -*- coding: utf-8 -*-
from odoo import http

# class ModuloBruno(http.Controller):
#     @http.route('/modulo_bruno/modulo_bruno/', auth='public')
#     def index(self, **kw):
#         return "Hello, world"

#     @http.route('/modulo_bruno/modulo_bruno/objects/', auth='public')
#     def list(self, **kw):
#         return http.request.render('modulo_bruno.listing', {
#             'root': '/modulo_bruno/modulo_bruno',
#             'objects': http.request.env['modulo_bruno.modulo_bruno'].search([]),
#         })

#     @http.route('/modulo_bruno/modulo_bruno/objects/<model("modulo_bruno.modulo_bruno"):obj>/', auth='public')
#     def object(self, obj, **kw):
#         return http.request.render('modulo_bruno.object', {
#             'object': obj
#         })