package br.com.fiap.model.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusPedidoEnum {

    PEDIDO_RECEBIDO("Recebido", "Seu pedido foi recebido e está sendo processado."),
    AGUARDANDO_PAGAMENTO("Aguardando Pagamento", "Seu pedido foi aprovado e está aguardando pagamento."),
    PEDIDO_PAGO("Pagamento aprovado!","Pagamento aprovado! Pedido sendo preparado para entrega."),
    PREPARANDO_PARA_ENVIO("Pedido em preparação","Seu pedido está sendo preparado para envio."),
    EM_TRANSITO("Pedido em trânsito","Seu pedido está à caminho. Acompanhe a entrega do(s) produto(s)."),
    ENTREGUE("Produto entregue", "Produto foi entregue! Agradecemos sua compra!");

    private String nome;
    private String descricao;

}
