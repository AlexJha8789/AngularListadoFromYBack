export class Cliente {
    id: number;
    tipoDocumento: {
        id: number;
        des_tipoDoc: string;
    };
    num_documento: string;
    nombre: string;
    ape_pat: string;
    ape_mat: string;
    fec_nacimiento: Date;
    email: string;

    constructor(){
        this.id = 0;
        this.tipoDocumento = {
            id: 0,
            des_tipoDoc: "",
        };
        this.num_documento = "";
        this.nombre = "";
        this.ape_pat = "";
        this.ape_mat = "";
        this.fec_nacimiento = new Date(); 
        this.email = "";
    }
}