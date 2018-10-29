# -*- coding: utf-8 -*-

from odoo import models, fields, api


class modulo_bruno(models.Model):

    _name = 'modulo_bruno.modulo_bruno'

    fecha = fields.Date()
    matricula = fields.Char()
    value = fields.Integer()
    precio = fields.Float(compute="_value_pc", store=True)
    description = fields.Text()
    metodo_de_pago = fields.Selection([
        ('Paypal', 'Pagar con Paypal'),
        ('Tarjeta de credito', 'Pagar con Tarjeta de credito'),
        ('Efectivo', 'Pagar en efectivo')], string='Método de pago')

    @api.depends('value')
    def _value_pc(self):
        value2 = float(self.value) / 100
