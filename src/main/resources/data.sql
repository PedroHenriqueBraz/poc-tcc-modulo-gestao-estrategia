-- inserindo entradas do saf
insert into entrada(entrada_id, valor, data, cliente_id) values (1,1000, '2022-01-01', 1)
insert into entrada(entrada_id, valor, data, cliente_id) values (2,2000, '2022-01-01', 1)
insert into entrada(entrada_id, valor, data, cliente_id) values (3,200, '2022-01-15', 2)
insert into entrada(entrada_id, valor, data, cliente_id) values (4,4000, '2022-02-10', 3)
insert into entrada(entrada_id, valor, data, cliente_id) values (5,300, '2022-02-10', 3)
insert into entrada(entrada_id, valor, data, cliente_id) values (6,700, '2022-02-10', 1)
insert into entrada(entrada_id, valor, data, cliente_id) values (7,700, '2022-02-10', 5)
insert into entrada(entrada_id, valor, data, cliente_id) values (8,4000, '2022-03-10', 4)
insert into entrada(entrada_id, valor, data, cliente_id) values (9,600, '2022-03-15', 1)


-- inserido saidas do saf
insert into saida(saida_id, valor, data, fornecedor_id) values (1,1000, '2022-01-01', 1)
insert into saida(saida_id, valor, data, fornecedor_id) values (2,2000, '2022-02-02', 1)
insert into saida(saida_id, valor, data, fornecedor_id) values (3,200, '2022-03-15', 2)
insert into saida(saida_id, valor, data, fornecedor_id) values (4,4000, '2022-04-10', 3)

-- folha de pagamento saf
insert into folha_pagamento(folha_id, valor, data) values (1,2000, '2022-01-10')
insert into folha_pagamento(folha_id, valor, data) values (2,2100, '2022-02-10')
insert into folha_pagamento(folha_id, valor, data) values (3,2000, '2022-03-10')