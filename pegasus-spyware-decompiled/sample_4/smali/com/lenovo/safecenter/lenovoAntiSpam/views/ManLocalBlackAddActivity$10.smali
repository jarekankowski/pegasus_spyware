.class final Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;
.super Ljava/lang/Thread;
.source "ManLocalBlackAddActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;->initApp_deleteWhite(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;


# direct methods
.method constructor <init>(Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 470
    iput-object p1, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;

    iput-object p2, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 473
    :try_start_0
    iget-object v3, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;->a(Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;Z)Z

    .line 474
    iget-object v3, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;

    invoke-static {v3}, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;->j(Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;)Lcom/lenovo/safecenter/lenovoAntiSpam/domain/ContractHelpUtils;

    move-result-object v3

    iget-object v4, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->a:Ljava/util/List;

    invoke-virtual {v3, v4}, Lcom/lenovo/safecenter/lenovoAntiSpam/domain/ContractHelpUtils;->noContractRepeatList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 475
    .local v1, "list_help":Ljava/util/List;, "Ljava/util/List<Lcom/lenovo/safecenter/lenovoAntiSpam/domain/Contract;>;"
    iget-object v3, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;

    invoke-static {v3}, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;->j(Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;)Lcom/lenovo/safecenter/lenovoAntiSpam/domain/ContractHelpUtils;

    move-result-object v3

    iget-object v4, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;

    invoke-virtual {v3, v1, v4}, Lcom/lenovo/safecenter/lenovoAntiSpam/domain/ContractHelpUtils;->getWhiteFromadd(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    .line 478
    .local v2, "list_w":Ljava/util/List;, "Ljava/util/List<Lcom/lenovo/safecenter/lenovoAntiSpam/domain/Contract;>;"
    iget-object v3, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;

    iget-object v3, v3, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;->a:Lcom/lenovo/safecenter/lenovoAntiSpam/database/AppDatabase;

    invoke-virtual {v3, v2}, Lcom/lenovo/safecenter/lenovoAntiSpam/database/AppDatabase;->deleteWhitebyrealnumber(Ljava/util/List;)V

    .line 479
    iget-object v3, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;

    iget-object v3, v3, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;->a:Lcom/lenovo/safecenter/lenovoAntiSpam/database/AppDatabase;

    const/4 v4, 0x2

    invoke-virtual {v3, v1, v4}, Lcom/lenovo/safecenter/lenovoAntiSpam/database/AppDatabase;->insertLocalBlack(Ljava/util/List;I)V

    .line 480
    iget-object v3, p0, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity$10;->b:Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;

    invoke-static {v3}, Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;->k(Lcom/lenovo/safecenter/lenovoAntiSpam/views/ManLocalBlackAddActivity;)Landroid/os/Handler;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 485
    .end local v1    # "list_help":Ljava/util/List;, "Ljava/util/List<Lcom/lenovo/safecenter/lenovoAntiSpam/domain/Contract;>;"
    .end local v2    # "list_w":Ljava/util/List;, "Ljava/util/List<Lcom/lenovo/safecenter/lenovoAntiSpam/domain/Contract;>;"
    :goto_0
    return-void

    .line 482
    :catch_0
    move-exception v0

    .line 483
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method