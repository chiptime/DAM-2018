# -*- coding: utf-8 -*-
from odoo import http

# class Parquimetro(http.Controller):
#     @http.route('/parquimetro/parquimetro/', auth='public')
#     def index(self, **kw):
#         return "Hello, world"

#     @http.route('/parquimetro/parquimetro/objects/', auth='public')
#     def list(self, **kw):
#         return http.request.render('parquimetro.listing', {
#             'root': '/parquimetro/parquimetro',
#             'objects': http.request.env['parquimetro.parquimetro'].search([]),
#         })

#     @http.route('/parquimetro/parquimetro/objects/<model("parquimetro.parquimetro"):obj>/', auth='public')
#     def object(self, obj, **kw):
#         return http.request.render('parquimetro.object', {
#             'object': obj
#         })