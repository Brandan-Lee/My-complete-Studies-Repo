from django.db import models
from modelcluster.fields import ParentalKey
from wagtail.admin.panels import FieldPanel, MultipleChooserPanel
from wagtail.models import Page, Orderable


class GenericPage(Page):
    banner_title = models.CharField(
        max_length=100,
        default="Welcome to my generic page"
    )
    
    introduction = models.TextField(
        blank=True,
    )

    banner_image = models.ForeignKey(
        'wagtailimages.Image',
        null = True,
        blank = False,
        on_delete = models.SET_NULL,
        related_name = "+"
    )
    
    content_panels = Page.content_panels + [
        FieldPanel("banner_title"),
        FieldPanel("introduction"),
        MultipleChooserPanel(
            "banner_image",
            label = "Banner image",
            chooser_field_name = "image",
        ),
    ]
